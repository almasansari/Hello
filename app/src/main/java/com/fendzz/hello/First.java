package com.fendzz.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class First extends AppCompatActivity {
   // TextView text;
   // EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
      //  TextView text = (TextView)findViewById(R.id.change);
//        edit = (EditText)findViewById(R.id.edit);
//        String a =hello.getObject();
//        text.setText(a);
       // Toast.makeText(getApplicationContext(),"Hi buddy what happings",Toast.LENGTH_LONG).show();
       // Button click = (Button)findViewById(R.id.btn_toast);
        WebView browser = (WebView)findViewById(R.id.webview);
        // Enable javascript
        browser.getSettings().setJavaScriptEnabled(true);
        // Set WebView client
        browser.setWebChromeClient(new WebChromeClient());
        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // Load the webpage
        browser.loadUrl("http://google.com/");
    }



    public void btn_click(View view)
    {


      //MyApplication.setObject(edit.getText());
        show_toast();

    }

    private void show_toast()
    {
       //  Toast.makeText(getApplicationContext(),"Hi buddy what happings",Toast.LENGTH_LONG).show();
       // text.setText("This is custom Toast");
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setView(layout);
        toast.show();
    }
}
