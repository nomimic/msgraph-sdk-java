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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Android Custom Configuration Request.
 */
public interface IBaseAndroidCustomConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidCustomConfiguration> callback);

    /**
     * Gets the AndroidCustomConfiguration from the service
     *
     * @return the AndroidCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidCustomConfiguration with a source
     *
     * @param sourceAndroidCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidCustomConfiguration sourceAndroidCustomConfiguration, final ICallback<AndroidCustomConfiguration> callback);

    /**
     * Patches this AndroidCustomConfiguration with a source
     *
     * @param sourceAndroidCustomConfiguration the source object with updates
     * @return the updated AndroidCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration patch(final AndroidCustomConfiguration sourceAndroidCustomConfiguration) throws ClientException;

    /**
     * Posts a AndroidCustomConfiguration with a new object
     *
     * @param newAndroidCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidCustomConfiguration newAndroidCustomConfiguration, final ICallback<AndroidCustomConfiguration> callback);

    /**
     * Posts a AndroidCustomConfiguration with a new object
     *
     * @param newAndroidCustomConfiguration the new object to create
     * @return the created AndroidCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidCustomConfiguration post(final AndroidCustomConfiguration newAndroidCustomConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseAndroidCustomConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseAndroidCustomConfigurationRequest expand(final String value);

}

