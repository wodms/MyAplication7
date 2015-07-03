package kr.ac.daegu.app.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.SearchManager;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void googleSearch(View v){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "대구대학교");
        startActivity(intent);
    }
    public void webBrowser(View v){
        Uri uri=Uri.parse("http://www.daegu.ac.kr");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public  void googleMap(View v){
        Uri uri=Uri.parse("geo:38.899533,-77.036476");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    public  void Dialer(View v){
        Uri uri = Uri.parse( "tel:01076842196");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);

    }

    public  void Call(View v){
        Uri uri = Uri.parse( "tel:01076842196");
        Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
