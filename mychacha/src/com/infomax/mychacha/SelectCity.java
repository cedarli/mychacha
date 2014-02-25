package com.infomax.mychacha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectCity extends Activity {
	private Button mBackBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cityselect);
		mBackBtn=(Button)this.findViewById(R.id.city_back);
		mBackBtn.setOnClickListener(new OnClickListener(){
		   public void onClick(View arg0) {
			   Intent result = new Intent(SelectCity.this, Mychacha.class);
			   //璁剧疆 bintent鐨凚undle鐨勪竴涓�
			   String city = "北京"; 
			   result.putExtra("city", city);
			   setResult(1,result);
			   finish();
		   }

	   });
	}

}
