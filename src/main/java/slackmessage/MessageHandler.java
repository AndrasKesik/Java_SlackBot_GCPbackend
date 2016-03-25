package slackmessage;


import com.google.appengine.labs.repackaged.org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


public class MessageHandler extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        Map<String,String> params = new HashMap<String,String>();

        String response_url = request.getParameter("response_url");

        params.put("token",request.getParameter("token"));
        params.put("team_id",request.getParameter("team_id"));
        params.put("team_domain",request.getParameter("team_domain"));
        params.put("channel_id",request.getParameter("channel_id"));
        params.put("channel_name",request.getParameter("channel_name"));
        params.put("user_id",request.getParameter("user_id"));
        params.put("user_name",request.getParameter("user_name"));
        params.put("command",request.getParameter("command"));
        params.put("text",request.getParameter("text"));
        params.put("response_url",response_url);

        response.setStatus(200);

        for (Map.Entry<String, String> entry : params.entrySet())
        {
            printWriter.println(entry.getKey() + " : " + entry.getValue());
        }

//        String urlParameters  = "param1=a&param2=b&param3=c";
//
//        URL url            = new URL(response_url);
//        HttpURLConnection conn= (HttpURLConnection) url.openConnection();
//        conn.setDoOutput( true );
//        conn.setRequestMethod( "POST" );
//        conn.setRequestProperty( "Content-Type", "application/x-www-form-urlencoded");
//
//        try{
//            OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
//            writer.write(urlParameters);
//            writer.flush();
//        }catch (Exception e){
//            e.printStackTrace();
//        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
