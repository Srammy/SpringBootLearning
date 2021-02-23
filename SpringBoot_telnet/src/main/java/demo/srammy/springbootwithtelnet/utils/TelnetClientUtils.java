package demo.srammy.springbootwithtelnet.utils;

import org.apache.commons.net.telnet.TelnetClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.SocketException;

/**
 *功能说明:Java通过Telnet访问主机
 */
public class TelnetClientUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    private final static Logger LOGGER = LoggerFactory.getLogger(TelnetClientUtils.class);
    /**
     * 结束标识字符串,Windows中是>,Linux中是#
     */
    private String prompt = "ARGOS READY";

    /**
     * 结束标识字符
     */
    private char promptChar = '/';

    /**
     * TelnetClient对象
     */
    private TelnetClient telnet;

    /**
     * 超时时间
     */
    private int timeOut = 20000;

    /**
     * InputStream 输入流,接收返回信息
     */
    private InputStream in;

    /**
     * PrintStream 向服务器写入 命令
     */
    private PrintStream out;

    /**
     * 构造函数
     * @param termtype
     * @param prompt
     */
    public TelnetClientUtils(String termtype, String prompt){
        telnet = new TelnetClient(termtype);
        telnet.setConnectTimeout(timeOut);
        setPrompt(prompt);
    }

    /**
     * 构造函数
     * @param termtype
     */
    public TelnetClientUtils(String termtype) {

        telnet = new TelnetClient(termtype);
        telnet.setConnectTimeout(timeOut);
    }

    /**
     * 构造函数
     */
    public TelnetClientUtils() {
        telnet = new TelnetClient();
        telnet.setConnectTimeout(timeOut);
    }

    /**
     * 登录到目标主机
     * @param ip Ip地址
     * @param port 端口号
     * @param username 用户名
     * @param password 密码
     */
    public String login(String ip, int port, String username, String password){
        String result = Constants.success;
        try {
            telnet.connect(ip, port);
            telnet.setSoTimeout(timeOut*100);
            in = telnet.getInputStream();
            out = new PrintStream(telnet.getOutputStream());
            readUntil("Username:");
            write(username);
            readUntil("Password:");
            write(password);
            String rs = readUntil(prompt);
            if(rs!=null&&rs.contains(prompt)) {
                LOGGER.debug("登录成功"+rs);;
            }else{
                result = Constants.error;
                LOGGER.error("登录失败："+rs);
            }
        } catch (Exception e) {
            result = Constants.error;
            LOGGER.error("登录失败："+result+","+e.getMessage());
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * 读取分析结果
     * @param pattern	匹配到该字符串时返回结果
     * @return String
     */
    public String readUntil(String pattern) {
        StringBuffer sb = new StringBuffer();
        try {
            char lastChar = (char)-1;
            boolean flag = pattern!=null&&pattern.length()>0;
            if(flag)
                lastChar = pattern.charAt(pattern.length() - 1);
            char ch;
            int code = -1;
            while ((code = in.read()) != -1) {
                ch = (char)code;
                sb.append(ch);
                //匹配到结束标识时返回结果
                if (flag) {

                    if (prompt.equals(pattern)) {
                        if(sb.toString().contains(pattern) && sb.toString().endsWith("/")){

                            return sb.toString();
                        }

                    }else{
                        if (ch == lastChar && sb.toString().endsWith(pattern)) {
                            return sb.toString();
                        }
                    }
                }else{
                    //如果没指定结束标识,匹配到默认结束标识字符时返回结果
                    if(ch == promptChar)
                        return sb.toString();
                }
                //登录失败时返回结果
                if(sb.toString().contains("User authorization failure")){
                    LOGGER.error("User authorization failure");
                    return sb.toString();
                }
                //命令不正确时返回
                if(sb.toString().contains("Invalid list")){
                    LOGGER.error(sb.toString());
                    return sb.toString();
                }
                if(sb.toString().contains("无法")|| sb.toString().contains("失败")){
                    LOGGER.error(sb.toString());
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("读异常");
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    /**
     * 发送命令
     * @param value
     */
    public void write(String value) {
        try {
            out.println(value);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     *功能说明:发送命令,返回执行结果
     *
     *输入参数:command telnet命令
     *
     *输出参数:String 命令执行结果
     *
     */
    public String sendCommand(String command) {
        LOGGER.debug("执行命令："+command);
        try {
            write(command);
            String result = readUntil(prompt);
            if(result == null || "".equals(result.trim())){
                LOGGER.error("获取"+prompt+"数据为空");
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *功能说明:关闭telnet连接
     *
     *输入参数:
     *
     *输出参数:
     */
    public void distinct(){
        try {
            if(telnet!=null&&!telnet.isConnected()){
                telnet.disconnect();
                LOGGER.info("断开连接");
                System.out.println("断开");
            }
        } catch (IOException e) {
            LOGGER.error("断开连接失败:"+e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     *功能说明:设置结束标识符
     *
     *输入参数:prompt 结束标识符
     *
     *输出参数:
     */
    public void setPrompt(String prompt) {
        if(prompt!=null){
            this.prompt = prompt;
            this.promptChar = prompt.charAt(prompt.length()-1);
        }
    }

    /**
     *功能说明:测试函数
     *
     *输入参数:args
     *
     *输出参数:
     */
    public static void main(String[] args) throws SocketException {
        TelnetClientUtils telnet = new TelnetClientUtils("VT220","#");//Windows,用VT220,否则会乱码
        telnet.login("192.168.83.129", 23, "root", "123456");
        String r1 = telnet.sendCommand("pwd");
        System.out.println(r1);
    }

}
