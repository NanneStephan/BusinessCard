package nl.nannestephan.businesscard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void homePage(View view){
        TextView homePage = findViewById(R.id.homepage);
        homePage.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void gitHub(View view){
        TextView gitHub = findViewById(R.id.gitHub);
        gitHub.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void linkedIn(View view){
        TextView linkedin = findViewById(R.id.LinkedIn);
        linkedin.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void eMail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain"); // send email as plain text
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "nannestephan@gmail.com" });
        startActivity(Intent.createChooser(intent, ""));
    }
}
