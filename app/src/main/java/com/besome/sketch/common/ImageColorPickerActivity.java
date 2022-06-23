package com.besome.sketch.common;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.besome.sketch.beans.SrcCodeBean;
import com.sketchware.remod.R;

import java.util.ArrayList;

import io.github.rosemoe.sora.widget.CodeEditor;

public class ImageColorPickerActivity extends AppCompatActivity {

  private ImageView picker_table;
  LinearLayout picker_color;
  TextView hex_color;
  Bitmap bitmap;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.image_color_picker_manager_activity );

        picker_table = findViewById( R.id.picker_table );
        picker_color = findViewById( R.id.picker_colored );
        hex_color = findViewById( R.id.hex_color );
        picker_table.setDrawingCacheEnabled( true );
        picker_table.buildDrawingCache(true);

        picker_table.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                bitmap = picker_table.getDrawingCache();
                int rgb = bitmap.getPixel( (int)event.getX(),(int)event.getY() );
                int red= Color.red(rgb);
                int green =Color.green( rgb );
                int blue = Color.blue( rgb );
                picker_color.setBackgroundColor( Color.rgb( red,green,blue ) );
                ColorDrawable colo=(ColorDrawable) picker_color.getBackground();
                int coloid = colo.getColor();
                String hexco =  String.format( "#%06X",(0xFFFFFF&coloid) );
                hex_color.setText( hexco );
                return true;
            }
        } );


    }
}
