package it.moondroid.fragments_example4;

import it.moondroid.fragments_example4.MyDialogFragment.EditNameDialogListener;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements
		EditNameDialogListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btnName = (Button) findViewById(R.id.buttonName);
		btnName.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				showEditDialog();

			}
		});

	}

	private void showEditDialog() {
		FragmentManager fm = getSupportFragmentManager();
		MyDialogFragment dialog = new MyDialogFragment();
		dialog.show(fm, "mydialogfragment");
	}

	@Override
	public void onFinishEditDialog(String inputText) {

		Toast.makeText(this, "Hi, " + inputText, Toast.LENGTH_SHORT).show();

	}

}
