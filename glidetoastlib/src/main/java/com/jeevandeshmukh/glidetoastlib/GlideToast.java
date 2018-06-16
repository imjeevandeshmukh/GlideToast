package com.jeevandeshmukh.glidetoastlib;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.Gravity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class GlideToast {

    private String message;
    private Activity activity;
    private int icon;
    public static int LENGTHTOOLONG = 1500;
    public static int LENGTHLONG = 1000;
    public static int LENGTHMEDIUM = 750;
    public static int LENGTHSHORT = 500;
    public static int LENGTHQUICK = 250;
    public static int TOP = 1;
    public static int CENTER = 2;
    public static int BOTTOM = 3;
    public static String DEFAULTTOAST = "DEFAULT";
    public static String SUCCESSTOAST = "SUCCESS";
    public static String FAILTOAST = "FAIL";
    public static String WARNINGTOAST = "WARN";
    public static String INFOTOAST = "INFO";
    public static String CUSTOMTOAST = "CUSTOM";


    private GlideToast() {
    }


    public static class makeToast {
        private String message;
        private Activity activity;
        private int icon;
        private int duration;
        private int gravity;
        private String style;
        private String backgroundcolor;

        public makeToast(Activity activity, String message, int duration, String style, int gravity) {
            this.activity = activity;
            this.message = message;
            this.duration = duration;
            this.style = style;
            this.gravity = gravity;

        }
        public makeToast(Activity activity, String message, int duration,String style) {
            this.activity = activity;
            this.message = message;
            this.duration = duration;
            this.style = style;

        }
        public makeToast(Activity activity, String message, int duration) {
            this.activity = activity;
            this.message = message;
            this.duration = duration;

        }
        public makeToast(Activity activity, String message, int duration,String style,int gravity,int icon, String backgroundcolor) {
            this.activity = activity;
            this.message = message;
            this.duration = duration;
            this.style = style;
            this.icon = icon;
            this.backgroundcolor = backgroundcolor;
            this.gravity = gravity;

        }


        public void setStyle(String style, LinearLayout background, ImageView iconImg) {
            switch (style) {
                case "SUCCESS":
                    background.setBackgroundResource(R.drawable.success_shape);
                    iconImg.setImageResource(R.drawable.ic_check_black_24dp);

                    break;
                case "FAIL":
                    background.setBackgroundResource(R.drawable.error_shape);
                    iconImg.setImageResource(R.drawable.ic_clear_black_24dp);

                    break;
                case "WARN":
                    background.setBackgroundResource(R.drawable.warning_shape);
                    iconImg.setImageResource(R.drawable.ic_pan_tool_black_24dp);

                    break;
                case "INFO":
                    background.setBackgroundResource(R.drawable.info_shape);
                    iconImg.setImageResource(R.drawable.ic_info_outline_black_24dp);
                    break;
                case "CUSTOM":
                    background.setBackgroundColor(Color.parseColor(backgroundcolor));
                    iconImg.setImageResource(icon);

                    break;
                default:
                    background.setBackgroundResource(R.drawable.default_shape);
                    iconImg.setImageResource(R.drawable.ic_info_outline_black_24dp);
                    break;

            }
        }


        public void setGravity(int gravity, Dialog dialog) {
            switch (gravity) {
                case 1:
                    dialog.getWindow().setGravity(Gravity.TOP);
                    break;
                case 2:
                    dialog.getWindow().setGravity(Gravity.CENTER);
                    break;
                case 3:
                    dialog.getWindow().setGravity(Gravity.BOTTOM);
                    break;
                default:
                    dialog.getWindow().setGravity(Gravity.BOTTOM);
                    break;
            }
        }


        TextView messageTV;
        ImageView iconImg;
        Dialog dialog;
        LinearLayout background;

        public void show() {
            dialog = new Dialog(activity, R.style.BottomDialogTheme);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(true);
            dialog.setContentView(R.layout.item_toast);
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            setGravity(gravity,dialog);
            messageTV = (TextView) dialog.findViewById(R.id.toast_text);
            iconImg = (ImageView) dialog.findViewById(R.id.toast_icon);
            background = (LinearLayout) dialog.findViewById(R.id.background);
            messageTV.setText(message);
            dialog.setCancelable(true);
            setStyle(style, background, iconImg);
            dialog.show();
            new Timer().schedule(
                    new TimerTask() {
                        @Override
                        public void run() {
                            dialog.dismiss();
                        }
                    }, duration);

        }


    }


}

