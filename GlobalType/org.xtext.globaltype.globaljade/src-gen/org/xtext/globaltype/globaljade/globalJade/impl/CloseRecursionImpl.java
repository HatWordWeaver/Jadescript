/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.globalJade.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.globaltype.globaljade.globalJade.CloseRecursion;
import org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage;
import org.xtext.globaltype.globaljade.globalJade.Recursion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Close Recursion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.impl.CloseRecursionImpl#getRecursionVariable <em>Recursion Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloseRecursionImpl extends MinimalEObjectImpl.Container implements CloseRecursion
{
  /**
   * The cached value of the '{@link #getRecursionVariable() <em>Recursion Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecursionVariable()
   * @generated
   * @ordered
   */
  protected Recursion recursionVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CloseRecursionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GlobalJadePackage.Literals.CLOSE_RECURSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Recursion getRecursionVariable()
  {
    if (recursionVariable != null && recursionVariable.eIsProxy())
    {
      InternalEObject oldRecursionVariable = (InternalEObject)recursionVariable;
      recursionVariable = (Recursion)eResolveProxy(oldRecursionVariable);
      if (recursionVariable != oldRecursionVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlobalJadePackage.CLOSE_RECURSION__RECURSION_VARIABLE, oldRecursionVariable, recursionVariable));
      }
    }
    return recursionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Recursion basicGetRecursionVariable()
  {
    return recursionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRecursionVariable(Recursion newRecursionVariable)
  {
    Recursion oldRecursionVariable = recursionVariable;
    recursionVariable = newRecursionVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlobalJadePackage.CLOSE_RECURSION__RECURSION_VARIABLE, oldRecursionVariable, recursionVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GlobalJadePackage.CLOSE_RECURSION__RECURSION_VARIABLE:
        if (resolve) return getRecursionVariable();
        return basicGetRecursionVariable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GlobalJadePackage.CLOSE_RECURSION__RECURSION_VARIABLE:
        setRecursionVariable((Recursion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GlobalJadePackage.CLOSE_RECURSION__RECURSION_VARIABLE:
        setRecursionVariable((Recursion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GlobalJadePackage.CLOSE_RECURSION__RECURSION_VARIABLE:
        return recursionVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //CloseRecursionImpl