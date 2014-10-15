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
/**
 * sets up the buttons as other names, as well as starting the lists for creation
 */
	private Button appButton;
	private Button textButton;
	private TextView appText;
	private TextView textNumber;
	private ArrayList<Integer> colorList;
	private ArrayList<Integer> textList;
	private int knowledgeNumber = 0;
	

	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		/**
		 * actually allows the buttons to be called
		 */
		textNumber = (TextView) findViewById(R.id.numberOfKnowledge);
		textButton = (Button) findViewById(R.id.textButton);
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		/**
		 * creates new lists for the names
		 */
		colorList = new ArrayList<Integer>();
		textList = new ArrayList<Integer>();
		/**
		 * runs the code to put objects in the color list
		 */
		fillTheColorList();
		/**
		 * runs the code to put objects in the texts list
		 */
		fillTheTextList();
		/**
		 * starts the listener for the buttons to actually function
		 */
		setupListeners();
		
		
	}
	/**
	 * adds the knowledge strings to the list
	 */
	private void fillTheTextList()
	{
		textList.add(R.string.knowledge1);
		textList.add(R.string.knowledge2);
		textList.add(R.string.knowledge3);
		textList.add(R.string.knowledge4);
		textList.add(R.string.knowledge5);
		textList.add(R.string.knowledge6);
		textList.add(R.string.knowledge7);
		textList.add(R.string.knowledge8);
		textList.add(R.string.knowledge9);
		textList.add(R.string.knowledge10);
		textList.add(R.string.knowledge11);
		textList.add(R.string.knowledge12);
		textList.add(R.string.knowledge13);
		textList.add(R.string.knowledge14);
		textList.add(R.string.knowledge15);
		textList.add(R.string.knowledge16);
		textList.add(R.string.knowledge17);
		textList.add(R.string.knowledge18);
		textList.add(R.string.knowledge19);
		textList.add(R.string.knowledge20);
		textList.add(R.string.knowledge21);
		textList.add(R.string.knowledge22);
		textList.add(R.string.knowledge23);
		textList.add(R.string.knowledge24);
		textList.add(R.string.knowledge25);
	}
	/**
	 * adds the color strings to the list
	 */
	private void fillTheColorList()
	{
		colorList.add(R.color.black);
		colorList.add(R.color.perple);
		colorList.add(R.color.uglyBrown);
		colorList.add(R.color.superRed);
		
		
	}
	/**
	 * starts the listeners for the buttons
	 */
	private void setupListeners()
	{
	
		
		textButton.setOnClickListener(new View.OnClickListener()
		{
			
			
			public void onClick(View currentView)
			{
				//button click stuff here
				int randomNumbers = (int) (Math.random() * textList.size());
				
				knowledgeNumber ++;
				textNumber.setText("Knowledge #" + knowledgeNumber);
				
				appText.setText(textList.get(randomNumbers));
			}
		});
		
		
		
		
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
		
			public void onClick(View currentView)
			{
				//button click stuff here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
			}
		});
	}
	
}
