package com.createdevelopment.house.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements MethodInterceptor{
	/*
	 * add some usefully method here to facility the development
	 */
	
	 static Logger logger = Logger.getLogger(BaseAction.class.getName());
	 public int currentPage; 
	// public Pager pager;
	 public final static String USER="CRNTUSER";
     private static int BUFFER_SIZE=16*1024;
     
     public HttpServletRequest getRequest(){
    	 
    	return  ServletActionContext.getRequest();
     }
     
     public HttpSession getSession(){
    	 return getRequest().getSession();
    	 
     }

	 public String getLan(){
		 Locale rl=this.getRequest().getLocale();
		 Locale sl=(Locale)this.getSession().getAttribute("WW_TRANS_I18N_LOCALE");
		 String lan="";
		 if(sl!=null){
			 lan=sl.getLanguage();
			
		 }
		 else
			 lan=rl.getLanguage(); 
		 return lan;
	 }

	public static String getLocalIP(){
		InetAddress LocalIP=null; 
		try{ 
		LocalIP=InetAddress.getLocalHost(); 
		return LocalIP.getHostAddress();
		} 
		catch(UnknownHostException e){} 
		return "";
		} 

	

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	
	public Object invoke(MethodInvocation methodinvoke) throws Throwable {
		// TODO Auto-generated method stub
		String loginfo="";
		Method method=methodinvoke.getMethod();
		String classname=method.getDeclaringClass().getName();
		method.getName();
		try {
			Object[] args=methodinvoke.getArguments();
			if(args!=null&&args.length>0)
			{
				for(int i=0;i<args.length;i++){
					loginfo+=args[i].getClass().getName()+" ; ";
					loginfo+=args[i].toString();
					loginfo+="   ;   ";
				}
			}
			
			
			Object returnValue = methodinvoke.proceed();
			
			return returnValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}

	public static void copy(File src, File dst)  {
        try  {
           InputStream in = null ;
           OutputStream out = null ;
            try  {                
               in = new BufferedInputStream( new FileInputStream(src), BUFFER_SIZE);
               out = new BufferedOutputStream( new FileOutputStream(dst), BUFFER_SIZE);
                byte [] buffer = new byte [BUFFER_SIZE];
                while (in.read(buffer) > 0 )  {
                   out.write(buffer);
               } 
            } finally  {
                if ( null != in)  {
                   in.close();
               } 
                 if ( null != out)  {
                   out.close();
               } 
           } 
        } catch (Exception e)  {
           e.printStackTrace();
       } 
   } 
   
    public static String getExtention(String fileName)  {
        int pos = fileName.lastIndexOf( " . " );
        return fileName.substring(pos);
   } 



    
    public String savePicture(File image,String imageContentType, String imageFileName, String realPath) {
		// TODO Auto-generated method stub
		imageFileName=imageFileName.substring(imageFileName.indexOf("."), imageFileName.length());
		String path=null;
		if(image!=null){
			try {
				String filename=new Date().getTime()+imageFileName;
			//	FileUtil.uploadFile(image, realPath+"upload",filename);
				path="upload" + "/" +filename;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return path;
    }
	
	
	}
     
     

