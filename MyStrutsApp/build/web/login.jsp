<%-- 
    Document   : login
    Created on : Dec 25, 2011, 8:27:08 PM
    Author     : kostasa
--%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="stylewin.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Struts Application</title>
    </head>
    <body>

        <h1>It's time to Rock ${cookie.userName.value} - Login to buy Malmsteen's merchandise</h1>
        <div class="table">
            <html:form action="/login">
                <table border="0">
                    
                    <tbody>
                        
                        <tr>
                            <td colspan="2"> 

                                <bean:write name="LoginForm" property="errorname" filter="false" />
                                &nbsp;</td>

                        </tr>
                        <tr>
                            <td><font face="Comic Sans MS">Enter your name:</font></td>
                            <td><html:text  property="name"  /></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <bean:write name="LoginForm" property="erroremail" filter="false"/>
                                &nbsp;</td>
                        </tr>
                        <tr>
                            <td><font face="Comic Sans MS">Enter your email:</font></td>
                            <td><html:text property="email" /></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <bean:write name="LoginForm" property="errorphrase" filter="false"/>
                                &nbsp;</td>
                        </tr>
                        <tr>
                            <td><font face="Comic Sans MS">Enter the passphrase you see:</font></td>
                            <td><html:text property="passphrase" /></td>
                            <td><font face="Comic Sans MS" size="3" color="red">t E x w W w</font></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td> <html:image src="http://primebusinessclub.com/wp-content/uploads/2008/03/check_small.png" value="Login" title="Press to login"/></td>
                        </tr>
                    </tbody>
                </table>


            </html:form>
            
        </div>
        <p>***Customer saved Info***</p>
        <p>Name:${cookie.userName.value}</p>
        <p>Email to conduct:${cookie.mail.value}</p>
        <p>Previous Market:${cookie.total.value} (dollars)</p> 
        <div class="download">
            KostasA<br/>
            Strouts Application<br/>
            <a href="http://www.box.com/s/u6gkxyfibsiqpg847fkj">Source Code</a>
        </div>
    </body>
    
   
</html>
