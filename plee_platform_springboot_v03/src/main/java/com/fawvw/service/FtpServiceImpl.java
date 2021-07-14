package com.fawvw.service;/*
package com.fawvw.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fawvw.pojo.FtpInteranceEntity;
import lombok.Data;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class FtpServiceImpl implements FtpService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired

    FtpInteranceEntity ftpInteranceEntity;


    @Override
    public Boolean uploadFile(InputStream inputStream, String fileName, String filePath) {
        logger.info("调用文件上传接口");
        // 定义保存结果
        boolean iaOk = false;
        // 初始化连接
        FTPClient ftp = new FTPClient();
        if (ftp != null) {
            try {
                // 设置文件传输模式为二进制，可以保证传输的内容不会被改变
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
                ftp.enterLocalPassiveMode();	//注：上传文件都为0字节，设置为被动模式即可
                // 跳转到指定路径，逐级跳转，不存在的话就创建再进入
                // 上传文件 参数：上传后的文件名，输入流,,返回Boolean类型，上传成功返回true
                iaOk = ftp.storeFile(fileName, inputStream);
                // 关闭输入流
                inputStream.close();
                // 退出ftp
                ftp.logout();
            } catch (IOException e) {
                logger.error(e.toString());
            } finally {
                if (ftp.isConnected()) {
                    try {
                        // 断开ftp的连接
                        ftp.disconnect();
                    } catch (IOException ioe) {
                        logger.error(ioe.toString());
                    }
                }
            }
        }
        return iaOk;

    }

    @Override
    public void downloadFileTo(String ftpFilePath, OutputStream out) {
        FTPClient ftp = new FTPClient();
        try{
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            ftp.retrieveFile(ftpFilePath, out);
            ftp.logout();
        } catch (Exception e) {
            logger.error("FTP文件下载失败！" + e.toString());
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    logger.error(ioe.toString());
                }
            }
        }

    }




    @Override
    public Boolean deleteFile(String ftpFilePath) {
        boolean  result = false;
        FTPClient ftp = new FTPClient();

        try {
            ftp.deleteFile(ftpFilePath);
            ftp.logout();
            return result;
        } catch (Exception e) {
            logger.error("FTP文件删除失败！" + e.toString());;
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                    logger.error(ioe.toString());
                }
            }
        }
        return result;

    }
}
*/
