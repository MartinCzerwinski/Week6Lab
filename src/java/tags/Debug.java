/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.util.Enumeration;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author 727525
 */
public class Debug extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        String serverName = pageContext.getRequest().getServerName();
        String firstWordServerName = "";
        try
        {
            firstWordServerName = serverName.substring(0, serverName.indexOf("."));
        }
        catch (StringIndexOutOfBoundsException e)
        {

        }
        if (firstWordServerName.equals("test") || serverName.equals("localhost"))
        {
            Enumeration<String> names = pageContext.getRequest().getParameterNames();
            for (Enumeration e = names; e.hasMoreElements();)
            {
                if (e.nextElement().equals("debug"))
                {
                    return EVAL_BODY_INCLUDE;
                }
            }
        }
        return SKIP_BODY;
    }
}
