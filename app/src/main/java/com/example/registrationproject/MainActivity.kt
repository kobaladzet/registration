package com.example.registrationproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var Name : EditText
    private lateinit var LastName: EditText
    private lateinit var Email: EditText
    private lateinit var Password: EditText
    private lateinit var Check: CheckBox
    private lateinit var Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Name = findViewById(R.id.name)
        LastName = findViewById(R.id.lastname)
        Email = findViewById(R.id.email)
        Password = findViewById(R.id.password)
        Check = findViewById(R.id.checkbox)
        Button = findViewById(R.id.button)
        Button.setOnClickListener {
            
            if (Name.text.toString().length < 3 || Name.text.toString() == "" ) {
                Toast.makeText(this, "შეიყვანე 3 ასოზე მეტი მეტი სახელის სექციაში", Toast.LENGTH_SHORT).show()
                
            }else if(LastName.text.toString().length < 5  || LastName.text.toString() == "") {
                Toast.makeText(this, "შეიყვანეთ გვარი სწორად", Toast.LENGTH_SHORT).show()
            }else if("@" !in Email.text.toString()){
                Toast.makeText(this, "შეიყვანეთ იმეილი სწორად", Toast.LENGTH_SHORT).show()
            }else if (Password.text.toString().length < 8 || Password.text.toString() == "") {
                Toast.makeText(this, "sheiyvane paroli chemi dzma", Toast.LENGTH_SHORT).show()
            }else if (!Check.isChecked) {
                Toast.makeText(this, "daetanxme wesebs!", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "gilocavvv slaayyyy", Toast.LENGTH_SHORT).show()
            }
            
        }

    }

    

}