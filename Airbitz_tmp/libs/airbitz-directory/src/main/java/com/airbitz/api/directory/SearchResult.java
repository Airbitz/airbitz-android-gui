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

package com.airbitz.api.directory;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    public static final String TAG = SearchResult.class.getSimpleName();
    private int mCountValue;
    private String mNextLink;
    private String mPreviousLink;
    private List<BusinessSearchResult> mBusinessSearchResultObjectsArray;


    public SearchResult(int countValue, String nextLink, String previousLink) {
        mCountValue = countValue;
        mNextLink = nextLink;
        mPreviousLink = previousLink;
    }

    public SearchResult(JSONObject responseJson) throws JSONException {
        if (responseJson != null) {
            mCountValue = responseJson.getInt("count");
            mNextLink = responseJson.getString("next");
            mPreviousLink = responseJson.getString("previous");
            mBusinessSearchResultObjectsArray = BusinessSearchResult.generateBusinessObjectListFromJSON(responseJson.getJSONArray("results"));
        }

    }

    public int getCountValue() {
        return mCountValue;
    }

    public void setCountValue(int countValue) {
        mCountValue = countValue;
    }

    public String getNextLink() {
        return mNextLink;
    }

    public void setNextLink(String nextLink) {
        mNextLink = nextLink;
    }

    public String getPreviousLink() {
        return mPreviousLink;
    }

    public void setPreviousLink(String previousLink) {
        mPreviousLink = previousLink;
    }

    public List<BusinessSearchResult> getBusinessSearchObjectArray() {
        return mBusinessSearchResultObjectsArray;
    }

    public void setBusinessSearchObjectArray(ArrayList<BusinessSearchResult> businessSearchResultArray) {
        mBusinessSearchResultObjectsArray = businessSearchResultArray;
    }

}
