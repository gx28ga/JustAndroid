package com.axun.justandroid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class BaseDialog extends AlertDialog {
  protected BaseDialog(Context context) {
    super(context);
  }

  protected BaseDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
    super(context, cancelable, cancelListener);
  }

  protected BaseDialog(Context context, int themeResId) {
    super(context, themeResId);
  }
  
  
  
}
