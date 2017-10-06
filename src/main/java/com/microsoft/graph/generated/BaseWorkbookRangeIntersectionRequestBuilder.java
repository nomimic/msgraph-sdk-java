// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Intersection Request Builder.
 */
public class BaseWorkbookRangeIntersectionRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeIntersection
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeIntersectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final String anotherRange) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("anotherRange", anotherRange));
    }

    /**
     * Creates the IWorkbookRangeIntersectionRequest
     *
     * @return The IWorkbookRangeIntersectionRequest instance
     */
    public IWorkbookRangeIntersectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeIntersectionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeIntersectionRequest instance
     */
    public IWorkbookRangeIntersectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookRangeIntersectionRequest request = new WorkbookRangeIntersectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}