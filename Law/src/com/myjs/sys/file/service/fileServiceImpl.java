package com.myjs.sys.file.service;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.myjs.commons.DateTimeFormat;
import com.myjs.commons.FilesUploads;
import com.myjs.sys.file.Dao.fileDao;
import com.myjs.sys.file.model.LSysFile;

public class fileServiceImpl implements fileService{
	private static final Logger log = LogManager.getLogger(fileServiceImpl.class);

	private fileDao fileDao;
	
	public fileDao getFileDao() {
		return fileDao;
	}

	public void setFileDao(fileDao fileDao) {
		this.fileDao = fileDao;
	}

	public List<LSysFile> findByProperty(LSysFile queryLSysFile) throws Exception{
		if(queryLSysFile == null){
			return fileDao.findAll();
		}else{
			return fileDao.findbyproperties(queryLSysFile.getFileName());
		}
	}
	
	public boolean addFile(LSysFile addLSysFile) throws Exception{
		return fileDao.save(addLSysFile);
	}
	
	public boolean deleteFile(LSysFile deleteLSysFile) throws Exception{
		return fileDao.delete(deleteLSysFile);
	}

	public String uploadFile(File[] uploadFile, String path, String fileName, String signedpath) throws Exception{
		String uploadDatetime = DateTimeFormat.getNowDateNum();
		if(signedpath != null && !signedpath.equals("")){
			path += signedpath + "/" + uploadDatetime;
		}else{
			path += "/" + uploadDatetime;
		}
		FilesUploads filesupload = new FilesUploads();
		filesupload.fileUpload(uploadFile, path, fileName);
		return uploadDatetime;
	}
}
