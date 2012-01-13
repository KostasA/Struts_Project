<%-- 
    Document   : success
    Created on : Dec 25, 2011, 9:24:53 PM
    Author     : kostasa
--%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style2.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success</title>
    </head>
    <body>
        <p>You have succesfully logged in <bean:write name="LoginForm" property="name"/> . </p> 
        <html:form action="/calculatevalues">
            <table border="1" align="center">
                <tr>
                    <td></td>
                    <td><b>Item</b></td>
                    <td><b>Price</b></td>
                    <td><b>Quantity</b></td>
                    <td><b>Total</b></td>
                </tr>
                <tr>
                    <td><img  src="http://cover7.cduniverse.com/CDUCoverArt/Music/Small/35/1056535.jpg"  width="80" height="80"</td>
                    <td>Marching Out CD  (1985)</td>
                    <td>9.99</td>
                    <td><html:text  property="marchqua" /></td>
                    <td><html:text property="marchvalue" /></td>

                </tr>
                <tr>
                    <td><img src="http://cover7.cduniverse.com/CDUCoverArt/Music/Small/63/1056663.jpg"  width="80" height="80"</td>
                    <td>Trilogy CD  (1986)</td>
                    <td>9.45</td>
                    <td><html:text  property="trilqua" /></td>
                    <td><html:text property="trilvalue" /></td>
                </tr>
                <tr>
                    <td><img src="http://cover7.cduniverse.com/CDUCoverArt/Music/Small/72/1056872.jpg"  width="80" height="80"</td>
                    <td> Eclipse CD  (1990)</td>
                    <td>12.25</td>
                    <td><html:text  property="eclipsequa" /></td>
                    <td><html:text property="eclipsevalue" /></td>
                </tr>
                <tr>
                    <td><img src="http://cover7.cduniverse.com/CDUCoverArt/Music/Small/27/1384727.jpg"  width="80" height="80"</td>
                    <td>Fire & Ice CD  (1992)</td>
                    <td>14.09</td>
                    <td><html:text  property="fiCDqua" /></td>
                    <td><html:text property="fiCDvalue" /></td>
                </tr>
                <tr>
                    <td><img src="http://cover7.cduniverse.com/CDUCoverArt/video/Small/03/7820103.jpg"  width="80" height="80"</td>
                    <td>Yngwie Malmsteen - Live In Budokan DVD  (1994)</td>
                    <td>13.49</td>
                    <td><html:text  property="budokanqua" /></td>
                    <td><html:text property="budokanvalue" /></td>
                </tr>
                <tr>
                    <td><img src="http://cdn2.iofferphoto.com/img3/item/214/800/802/yngwie-malmsteen-fender-black-t-shirt-27e28.jpg"  width="80" height="80"</td>
                    <td>T-Shirt, Rising Force, Black</td>
                    <td>30.00</td>
                    <td><html:text  property="shirtRfBqua" /></td>
                    <td><html:text property="shirtRfBvalue" /></td>
                </tr>
                <tr>
                    <td><img src="http://media.fmicdirect.com/fender/images/products/guitars/0107112841_frt_tbn_001.png"  width="80" height="80"</td>
                    <td>Yngwie Malmsteen Stratocaster®</td>
                    <td>2399.99</td>
                    <td><html:text  property="casterqua" /></td>
                    <td><html:text property="castervalue" /></td>
                </tr>
                <tr>
                    <td><b>Total</b></td>
                    <td></td>
                    <td></td>
                    <td><html:submit value="Submit" title="Press to purchase"/></td>
                    <td bgcolor="#3399FF"><html:text property="totalvalue" /></td>
                </tr>
            </table> 
            
        </html:form>
        <a href="/~konanast/login.do" >Log out</a>   
    </body>
</html>
