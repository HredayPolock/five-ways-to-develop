package com.softvally.a5waystodevelopthemindforsuccess;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DesignActivity extends AppCompatActivity {


    /* renamed from: com.trmlab.self_made_millionaires.splash$a */
    public class C1896a implements View.OnClickListener {
        public C1896a() {
        }

        public void onClick(View view) {
            DesignActivity.this.startActivity(new Intent(DesignActivity.this, MainActivity.class));
        }
    }

    /* renamed from: com.trmlab.self_made_millionaires.splash$b */
    public class C1897b implements View.OnClickListener {
        public C1897b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.softvally.a5waystodevelopthemindforsucces"));
            DesignActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.trmlab.self_made_millionaires.splash$c */
    public class C1898c implements View.OnClickListener {
        public C1898c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            String string = DesignActivity.this.getString(R.string.share);
            intent.putExtra("android.intent.extra.SUBJECT", "");
            intent.putExtra("android.intent.extra.TEXT", string);
            DesignActivity.this.startActivity(Intent.createChooser(intent, "Share Now"));
        }
    }

    /* renamed from: com.trmlab.self_made_millionaires.splash$d */
    public class C1899d implements View.OnClickListener {
        public C1899d() {
        }

        public void onClick(View view) {
            DesignActivity.this.startActivity(new Intent(DesignActivity.this, about.class));
        }
    }

    /* renamed from: com.trmlab.self_made_millionaires.splash$e */
    public class C1900e implements DialogInterface.OnClickListener {
        public C1900e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = "https://play.google.com/store/apps/details?id=com.softvally.a5waystodevelopthemindforsucces";
            String str2 = "android.intent.action.VIEW";
            try {
                DesignActivity.this.startActivity(new Intent(str2, Uri.parse(str)));
            } catch (ActivityNotFoundException unused) {
                DesignActivity.this.startActivity(new Intent(str2, Uri.parse(str)));
            }
            dialogInterface.dismiss();
            DesignActivity.this.finish();
        }
    }

    /* renamed from: com.trmlab.self_made_millionaires.splash$f */
    public class C1901f implements DialogInterface.OnClickListener {
        public C1901f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str = "https://play.google.com/store/apps/developer?id=Soft+Vally";
            String str2 = "android.intent.action.VIEW";
            try {
                DesignActivity.this.startActivity(new Intent(str2, Uri.parse(str)));
            } catch (ActivityNotFoundException unused) {
                DesignActivity.this.startActivity(new Intent(str2, Uri.parse(str)));
            }
            dialogInterface.dismiss();
            DesignActivity.this.finish();
        }
    }

    /* renamed from: com.trmlab.self_made_millionaires.splash$g */
    public class C1902g implements DialogInterface.OnClickListener {
        public C1902g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            DesignActivity.this.finish();
        }
    }



    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_design);


        ((TextView) findViewById(R.id.textview)).setSelected(true);
        TextView textView = (TextView) findViewById(R.id.text2);
        TextView textView2 = (TextView) findViewById(R.id.text3);
        TextView textView3 = (TextView) findViewById(R.id.text4);
        ((TextView) findViewById(R.id.text1)).setOnClickListener(new C1896a());
        textView.setOnClickListener(new C1897b());
        textView2.setOnClickListener(new C1898c());
        textView3.setOnClickListener(new C1899d());
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(DesignActivity.this);
        builder.setTitle("Rate Us");
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setMessage("Click the 'Rate' button to give your valuable feedback and 5 star rating. Click 'Get Out' button to get out!")
                .setPositiveButton("RATE US", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/details?id=com.softvally.a5waystodevelopthemindforsucces";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNeutralButton("MORE APPS", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String url = "https://play.google.com/store/apps/developer?id=Soft+Vally";
                        Intent up = new Intent(Intent.ACTION_VIEW);
                        up.setData(Uri.parse(url));
                        startActivity(up);
                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }


                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
