/**
 * Copyright (c) COMMSEN International. All rights reserved.
 *	
 * This library is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see http://www.gnu.org/licenses/lgpl.html.
 */

package com.commsen.liferay.multidevice.rules.service.persistence;

import com.commsen.liferay.multidevice.rules.model.Rule;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the rule service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link RuleUtil} to access the rule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Milen Dyankov
 * @see RulePersistenceImpl
 * @see RuleUtil
 * @generated
 */
public interface RulePersistence extends BasePersistence<Rule> {
	/**
	* Caches the rule in the entity cache if it is enabled.
	*
	* @param rule the rule to cache
	*/
	public void cacheResult(
		com.commsen.liferay.multidevice.rules.model.Rule rule);

	/**
	* Caches the rules in the entity cache if it is enabled.
	*
	* @param rules the rules to cache
	*/
	public void cacheResult(
		java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> rules);

	/**
	* Creates a new rule with the primary key. Does not add the rule to the database.
	*
	* @param rid the primary key for the new rule
	* @return the new rule
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule create(long rid);

	/**
	* Removes the rule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rid the primary key of the rule to remove
	* @return the rule that was removed
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule remove(long rid)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.commsen.liferay.multidevice.rules.model.Rule updateImpl(
		com.commsen.liferay.multidevice.rules.model.Rule rule, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rule with the primary key or throws a {@link com.commsen.liferay.multidevice.rules.NoSuchRuleException} if it could not be found.
	*
	* @param rid the primary key of the rule to find
	* @return the rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByPrimaryKey(
		long rid)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rule with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rid the primary key of the rule to find
	* @return the rule, or <code>null</code> if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule fetchByPrimaryKey(
		long rid) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the rules where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the rules where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the rules where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first rule in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last rule in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rules before and after the current rule in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rid the primary key of the current rule
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule[] findByGroup_PrevAndNext(
		long rid, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the rules where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByGroupAndAction(
		long companyId, long groupId, java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the rules where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByGroupAndAction(
		long companyId, long groupId, java.lang.String action, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the rules where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByGroupAndAction(
		long companyId, long groupId, java.lang.String action, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first rule in the ordered set where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByGroupAndAction_First(
		long companyId, long groupId, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last rule in the ordered set where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByGroupAndAction_Last(
		long companyId, long groupId, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rules before and after the current rule in the ordered set where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rid the primary key of the current rule
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule[] findByGroupAndAction_PrevAndNext(
		long rid, long companyId, long groupId, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByPage(
		long companyId, long groupId, long layoutId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByPage(
		long companyId, long groupId, long layoutId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByPage(
		long companyId, long groupId, long layoutId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByPage_First(
		long companyId, long groupId, long layoutId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByPage_Last(
		long companyId, long groupId, long layoutId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rules before and after the current rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rid the primary key of the current rule
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule[] findByPage_PrevAndNext(
		long rid, long companyId, long groupId, long layoutId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByPageAndAction(
		long companyId, long groupId, long layoutId, java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByPageAndAction(
		long companyId, long groupId, long layoutId, java.lang.String action,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByPageAndAction(
		long companyId, long groupId, long layoutId, java.lang.String action,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByPageAndAction_First(
		long companyId, long groupId, long layoutId, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByPageAndAction_Last(
		long companyId, long groupId, long layoutId, java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rules before and after the current rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rid the primary key of the current rule
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule[] findByPageAndAction_PrevAndNext(
		long rid, long companyId, long groupId, long layoutId,
		java.lang.String action,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByAll(
		long companyId, long groupId, long layoutId, java.lang.String brand,
		java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByAll(
		long companyId, long groupId, long layoutId, java.lang.String brand,
		java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findByAll(
		long companyId, long groupId, long layoutId, java.lang.String brand,
		java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByAll_First(
		long companyId, long groupId, long layoutId, java.lang.String brand,
		java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the last rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule findByAll_Last(
		long companyId, long groupId, long layoutId, java.lang.String brand,
		java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the rules before and after the current rule in the ordered set where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rid the primary key of the current rule
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next rule
	* @throws com.commsen.liferay.multidevice.rules.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.commsen.liferay.multidevice.rules.model.Rule[] findByAll_PrevAndNext(
		long rid, long companyId, long groupId, long layoutId,
		java.lang.String brand, java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.commsen.liferay.multidevice.rules.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the rules.
	*
	* @return the rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the rules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @return the range of rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the rules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of rules to return
	* @param end the upper bound of the range of rules to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of rules
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.commsen.liferay.multidevice.rules.model.Rule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rules where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rules where companyId = &#63; and groupId = &#63; and action = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupAndAction(long companyId, long groupId,
		java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPage(long companyId, long groupId, long layoutId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPageAndAction(long companyId, long groupId,
		long layoutId, java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAll(long companyId, long groupId, long layoutId,
		java.lang.String brand, java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rules from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the rules where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the rules where companyId = &#63; and groupId = &#63; and action = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param action the action to search with
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupAndAction(long companyId, long groupId,
		java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public int countByPage(long companyId, long groupId, long layoutId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and action = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param action the action to search with
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public int countByPageAndAction(long companyId, long groupId,
		long layoutId, java.lang.String action)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the rules where companyId = &#63; and groupId = &#63; and layoutId = &#63; and brand = &#63; and model = &#63; and os = &#63; and osVersion = &#63; and browser = &#63; and browserVersion = &#63; and pointingMethod = &#63; and tablet = &#63; and qwertyKeyboad = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param layoutId the layout id to search with
	* @param brand the brand to search with
	* @param model the model to search with
	* @param os the os to search with
	* @param osVersion the os version to search with
	* @param browser the browser to search with
	* @param browserVersion the browser version to search with
	* @param pointingMethod the pointing method to search with
	* @param tablet the tablet to search with
	* @param qwertyKeyboad the qwerty keyboad to search with
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public int countByAll(long companyId, long groupId, long layoutId,
		java.lang.String brand, java.lang.String model, java.lang.String os,
		java.lang.String osVersion, java.lang.String browser,
		java.lang.String browserVersion, java.lang.String pointingMethod,
		java.lang.String tablet, java.lang.String qwertyKeyboad)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the rules.
	*
	* @return the number of rules
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}