/**
 * Copyright (c) 2014, Airbitz Inc
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms are permitted provided that
 * the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 3. Redistribution or use of modified source code requires the express written
 *    permission of Airbitz Inc.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies,
 * either expressed or implied, of the Airbitz Project.
 */

package com.airbitz.fragments.settings;

import android.app.Fragment;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.airbitz.core.Account;
import co.airbitz.core.AirbitzCore;
import co.airbitz.core.android.AndroidUtils;

import com.airbitz.AirbitzApplication;
import com.airbitz.BuildConfig;
import com.airbitz.R;
import com.airbitz.fragments.BaseFragment;
import com.airbitz.objects.UploadLogAlert;

public class DebugFragment extends BaseFragment {

    View mView;
    private Button mClearWatchersButton;
    private Button mUploadLogButton;
    private Account mAccount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setDrawerEnabled(false);
        setBackEnabled(true);
        mAccount = AirbitzApplication.getAccount();
    }

    @Override
    public String getTitle() {
        return mActivity.getString(R.string.settings_button_debug);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_debug, container, false);

        mClearWatchersButton = (Button) mView.findViewById(R.id.fragment_debug_clear_watcher_button);
        mClearWatchersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ClearWatchersTask().execute();
            }
        });

        mUploadLogButton = (Button) mView.findViewById(R.id.fragment_debug_upload_log_button);
        mUploadLogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AirbitzCore.logi("Uploading logs from Debug Settings");
                UploadLogAlert uploadLogAlert = new UploadLogAlert(mActivity);
                uploadLogAlert.showUploadLogAlert();
            }
        });

        int versionCode = com.airbitz.BuildConfig.VERSION_CODE;
        String versionName = com.airbitz.BuildConfig.VERSION_NAME;
        String appVersion = versionName + " (" + Integer.toString(versionCode) + ")";
        TextView appVersionTextView = (TextView) mView.findViewById(R.id.debug_app_version_text);
        appVersionTextView.setText(appVersion);

        ((TextView) mView.findViewById(R.id.debug_network_version_text)).setText(AirbitzCore.getApi().isTestNet() ? "Testnet" : "Mainnet");

        ((TextView) mView.findViewById(R.id.debug_core_version_text)).setText(AirbitzCore.getApi().version());

        return mView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mActivity.popFragment();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void lockButton(View view, boolean enabled) {
        if (isAdded()) {
            view.setClickable(enabled);
            view.setEnabled(enabled);
        }
    }

    /**
     * Clear watchers
     */
    public class ClearWatchersTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            lockButton(mClearWatchersButton, false);
        }

        @Override
        protected Void doInBackground(Void... params) {
            mAccount.stopBackgroundTasks();
            mAccount.clearBlockchainCache();
            return null;
        }

        @Override
        protected void onPostExecute(Void v) {
            mAccount.startBackgroundTasks();
            lockButton(mClearWatchersButton, true);
        }

        @Override
        protected void onCancelled() {
            mAccount.startBackgroundTasks();
            lockButton(mClearWatchersButton, true);
        }
    }
}
