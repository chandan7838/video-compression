
package com.reactlibrary;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.reactlibrary.videocompression.MediaController;

import com.facebook.react.bridge.Promise;

public class RNVideoCompressionModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";
  String filepath="";
  Promise filePromise=null;
  public RNVideoCompressionModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNVideoCompression";
  }

  @ReactMethod
  public void getCompressedFile(String path,Promise promise) {
    filepath = path;
    filePromise = promise;
    new VideoCompressor().execute();
  }
  private class VideoCompressor extends AsyncTask<Void, Void, Boolean> {
    @Override
    protected void onPreExecute() {
      super.onPreExecute();
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
      return MediaController.getInstance().convertVideo(filepath);
    }

    @Override
    protected void onPostExecute(Boolean compressed) {
      super.onPostExecute(compressed);
      if (compressed) {
        filePromise.resolve(MediaController.cachedFile.getPath());
        Log.e("Compression", "Compression successfully!");
        Log.e("Compressed File Path", "" + MediaController.cachedFile.getPath());
      }
    }
  }
}