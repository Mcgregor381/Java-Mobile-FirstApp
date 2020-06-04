package uk.co.mycoffeeapp.Helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

public class AppConectivaty
{
    private Context mContect;


    public AppConectivaty(Context contex)
    {
        this.mContect=contex;
    }
    public  boolean isConnectingToInternet()
    {
        ConnectivityManager connectivaty = (ConnectivityManager) mContect.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivaty!=null)
        {NetworkInfo[] info = connectivaty.getAllNetworkInfo();
            for (int i =0 ; i< info.length ;i++)
            {
                if(info[i].getState()== NetworkInfo.State.CONNECTED)
                {
                    return true;
                }

            }

        }
        return false;
    }
}
