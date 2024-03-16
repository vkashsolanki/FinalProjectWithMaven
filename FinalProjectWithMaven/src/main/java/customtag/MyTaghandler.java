package customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;
 

public class MyTaghandler extends TagSupport
{
 
    
	private int num1,num2;
	public void setNum1(String num1)
	{
	this.num1=Integer.parseInt(num1);
	}
	
	public void setNum2(String num2)
	{
	this.num2=Integer.parseInt(num2);
	}
	
	public int doStartTag()
	{
	int res=num1+num2;
	try
	{
	JspWriter out=pageContext.getOut();
	out.println("Addition is:"+res);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	//return Tag.EVAL_BODY_INCLUDE;
	return Tag.SKIP_BODY;
	}

	 

}
