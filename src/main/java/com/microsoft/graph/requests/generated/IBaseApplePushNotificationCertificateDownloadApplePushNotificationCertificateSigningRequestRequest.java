// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Apple Push Notification Certificate Download Apple Push Notification Certificate Signing Request Request.
 */
public interface IBaseApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest {

    /**
     * Gets the String
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<String> callback);

    /**
     * Gets the String
     *
     * @return the String
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    String get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApplePushNotificationCertificateDownloadApplePushNotificationCertificateSigningRequestRequest expand(final String value);

}
