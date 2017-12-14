/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package my.bookstore.fulfilmentprocess.actions.order;

import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;

import org.apache.log4j.Logger;


/**
 * 
 */
public class GetPaymentDetailsAction extends AbstractProceduralAction<OrderProcessModel>
{
	private static final Logger LOG = Logger.getLogger(GetPaymentDetailsAction.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.processengine.spring.Action#execute(de.hybris.platform.processengine.model.BusinessProcessModel
	 * )
	 */
	@Override
	public void executeAction(final OrderProcessModel process)
	{
		LOG.info("Process: " + process.getCode() + " in step " + getClass());
	}
}
