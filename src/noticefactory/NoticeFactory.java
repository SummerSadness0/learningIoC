package noticefactory;

import notice.EmailNotice;
import notice.NoticeInterface;
import notice.PhoneNotice;

public class NoticeFactory {

    public static NoticeInterface getNotice(String noticeType){
        if(noticeType == null)
            return null;
        if(noticeType.equalsIgnoreCase("email")){
            return new EmailNotice();
        }
        else if(noticeType.equalsIgnoreCase("phone")){
            return  new PhoneNotice();
        }
        return null;
    }
}
