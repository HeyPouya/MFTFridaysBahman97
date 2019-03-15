package ir.mft.mftfridaysbahman97;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView extends AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


        String fontName = "vazir.ttf";
        Typeface vazir = Typeface.createFromAsset(context.getAssets(), fontName);
        this.setTypeface(vazir);
    }
}
