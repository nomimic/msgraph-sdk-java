// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

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

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Named Item Add Request Builder.
 */
public class WorkbookNamedItemAddRequestBuilder extends BaseWorkbookNamedItemAddRequestBuilder implements IWorkbookNamedItemAddRequestBuilder {

    /**
     * The request builder for this WorkbookNamedItemAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param reference the reference
     * @param comment the comment
     */
    public WorkbookNamedItemAddRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String name, final com.google.gson.JsonElement reference, final String comment) {
        super(requestUrl, client, requestOptions, name, reference, comment);
    }
}
