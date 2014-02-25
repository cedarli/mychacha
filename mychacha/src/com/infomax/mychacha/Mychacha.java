package com.infomax.mychacha;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mychacha extends Activity {
	 private Context mContext;
	 private Button mSelectCityBtn;
	 private int selectCity=1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mContext = this;
		mSelectCityBtn=(Button)this.findViewById(R.id.SelectedCity);
		mSelectCityBtn.setText("�Ϻ�");
		mSelectCityBtn.setOnClickListener(new OnClickListener(){
		   public void onClick(View arg0) {
		    // TODO Auto-generated method stub	
			Intent intent =new Intent(mContext,SelectCity.class);
			intent.putExtra("cedar", "");
			Bundle bundle=new Bundle();
			bundle.putString("hello", "hello");
			intent.putExtras(bundle);
			startActivityForResult(intent, selectCity);
			// startActivity(intent);// 跳转方法2
		   }});
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == selectCity)
			mSelectCityBtn.setText(data.getExtras().getString("city"));
		super.onActivityResult(requestCode, resultCode, data);  
	}
}
