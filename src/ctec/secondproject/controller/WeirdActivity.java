package ctec.secondproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private ArrayList<Integer> colorList;
	

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		
		
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.black);
		colorList.add(R.color.perple);
		colorList.add(R.color.uglyBrown);
		colorList.add(R.color.superRed);
		
		
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//button click stuff here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
			}
		});
	}
}
