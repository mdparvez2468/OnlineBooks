package com.example.shishubooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class QuizAdapter extends BaseAdapter {

    String[] questions;
    String[] options1;
    String[] options2;
    String[] options3;
    String[] options4;
    Context context;
    private LayoutInflater layoutInflater;
    public QuizAdapter(Context context,String[] questions,String[] options1,String[] options2,String[] options3,String[] options4){
        this.context = context;
        this.questions = questions;
        this.options1 = options1;
        this.options2 = options2;
        this.options3 = options3;
        this.options4 = options4;
    }
    @Override
    public int getCount() {
        return questions.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.takequiz,parent,false);
        }
       TextView question = convertView.findViewById(R.id.quizquestion);
       TextView option1 = convertView.findViewById(R.id.quizoption1);
       TextView option2 = convertView.findViewById(R.id.quizoption2);
       TextView option3 = convertView.findViewById(R.id.quizoption3);
       TextView option4 = convertView.findViewById(R.id.quizoption4);


       question.setText(questions[position]);
       option1.setText(this.options1[position]);
       option2.setText(this.options2[position]);
       option3.setText(this.options3[position]);
       option4.setText(this.options4[position]);
        return convertView;
    }
}
