package bugfeed.itc.bugfeed;

/**
 * Created by biswajeet on 20/7/17.
 */

public class DeveloperApps {

    public String appname;
    public  String appdesc;
    public String applink;

    public DeveloperApps(){


    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppdesc() {
        return appdesc;
    }

    public void setAppdesc(String appdesc) {
        this.appdesc = appdesc;
    }

    public String getApplink() {
        return applink;
    }

    public void setApplink(String applink) {
        this.applink = applink;
    }

    @Override
    public String toString() {
        return "APPNAME : "+this.appname + "\n" +"APP DESCRIPTION : "+ this.appdesc +"\n"+"APP LINK : " + this.applink;
    }
}

