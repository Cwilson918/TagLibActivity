package edu.matc.taglibactivity;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by craigwilson on 11/2/16.
 */
public class HelloWorldTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();


        Date today = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
        String todayFormatDate = formatDate.format(today);

        Calendar time = Calendar.getInstance();
        int hourOfDay = time.get(Calendar.HOUR_OF_DAY);

        if (todayFormatDate.equals("2016/10/31")) {
            out.println("Happy Halloween!");
        } else {
            if (hourOfDay < 12) {
                out.println("Good Morning!");
            } else {
                if (hourOfDay < 14) {
                    out.println("Good Afternoon!");
                } else {
                    out.println("Good Evening!");
                }
            }
        }
    }
}
