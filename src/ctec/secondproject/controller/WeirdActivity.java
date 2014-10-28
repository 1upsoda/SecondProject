package ctec.secondproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class WeirdActivity extends Activity
{
/**
 * sets up the buttons as other names, as well as starting the lists for creation
 */
	private Button whiteButton;
	private RelativeLayout appLayout;
	private Button appButton;
	private Button textButton;
	private TextView appText;
	private TextView textNumber;
	private ArrayList<Integer> colorList;
	private ArrayList<Integer> textList;
	private int knowledgeNumber = 0;
	private EditText phoneNumber;
	private EditText messageText;
	private Button sendMessage;

	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		/**
		 * actually allows the buttons to be called
		 */
		phoneNumber = (EditText) findViewById(R.id.phoneNumber);
		messageText = (EditText) findViewById(R.id.messageText);
		sendMessage = (Button) findViewById(R.id.sendMessage);
		
		whiteButton = (Button) findViewById(R.id.whiteBackground);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
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
		textList.add(R.string.knowledge26);
		textList.add(R.string.knowledge27);
		textList.add(R.string.knowledge28);
		textList.add(R.string.knowledge29);
		textList.add(R.string.knowledge30);
		textList.add(R.string.knowledge31);
		textList.add(R.string.knowledge32);
		textList.add(R.string.knowledge33);
		textList.add(R.string.knowledge34);
		textList.add(R.string.knowledge35);
		textList.add(R.string.knowledge36);
		textList.add(R.string.knowledge37);
		textList.add(R.string.knowledge38);
		textList.add(R.string.knowledge39);
		textList.add(R.string.knowledge40);
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
			
			
			@Override
			public void onClick(View currentView)
			{
				//button click stuff here
				int randomNumbers = (int) (Math.random() * textList.size());
				
				knowledgeNumber ++;
				textNumber.setText("Knowledge #" + knowledgeNumber);
				
				appText.setText(textList.get(randomNumbers));
			}
		});
		
		whiteButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				appLayout.setBackgroundResource(R.color.white);
			}
		});
		
		
		sendMessage.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				try
				{
					String contact = phoneNumber.getText().toString();
					String message = messageText.getText().toString();
					sendSMS(contact, message);
					
					Toast.makeText(currentView.getContext(), "message sent", Toast.LENGTH_SHORT).show();
				}
				catch(Exception currentException)
				{
					Toast.makeText(currentView.getContext(), "message not sent", Toast.LENGTH_LONG).show();
					Toast.makeText(currentView.getContext(), currentException.getMessage(), Toast.LENGTH_LONG).show();
				}
				
			}
		});	
			
		
		
		
		
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
		
			@Override
			public void onClick(View currentView)
			{
				//button click stuff here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
				appLayout.setBackgroundResource(colorList.get(randomIndex));
			}
		});
	}
	private void sendSMS(String messageAdress, String messageContent)
	{
		SmsManager mySMSManager = SmsManager.getDefault();
		mySMSManager.sendTextMessage(messageAdress, null, messageContent, null, null);
		
	}
}
