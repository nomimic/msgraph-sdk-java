// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Detected App Collection Request.
 */
public class BaseDetectedAppCollectionRequest extends BaseCollectionRequest<BaseDetectedAppCollectionResponse, IDetectedAppCollectionPage> implements IBaseDetectedAppCollectionRequest {

    /**
     * The request builder for this collection of DetectedApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDetectedAppCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDetectedAppCollectionResponse.class, IDetectedAppCollectionPage.class);
    }

    public void get(final ICallback<IDetectedAppCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDetectedAppCollectionPage get() throws ClientException {
        final BaseDetectedAppCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DetectedApp newDetectedApp, final ICallback<DetectedApp> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DetectedAppRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDetectedApp, callback);
    }

    public DetectedApp post(final DetectedApp newDetectedApp) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DetectedAppRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDetectedApp);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDetectedAppCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DetectedAppCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDetectedAppCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DetectedAppCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDetectedAppCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DetectedAppCollectionRequest)this;
    }

    public IDetectedAppCollectionPage buildFromResponse(final BaseDetectedAppCollectionResponse response) {
        final IDetectedAppCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DetectedAppCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DetectedAppCollectionPage page = new DetectedAppCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
