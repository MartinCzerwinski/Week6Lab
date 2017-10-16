/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import static java.lang.Math.E;
import java.net.URL;
import java.util.Enumeration;
import javax.lang.model.element.Element;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author 727525
 */
public class Debug extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        Enumeration<String> names = pageContext.getRequest().getParameterNames();
        
        for (Enumeration e = names; e.hasMoreElements();) {
        if (e.nextElement().equals("debug")) {
            return EVAL_BODY_INCLUDE;
            }
        }
        return SKIP_BODY;

    }

}

//        String myURL = pageContext.getRequest().getServletContext().getContextPath();
//        URL url = new URL(myURL);
//        String query = url.getQuery();
