/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.globalJade;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Close Recursion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.CloseRecursion#getRecursionVariable <em>Recursion Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getCloseRecursion()
 * @model
 * @generated
 */
public interface CloseRecursion extends EObject
{
  /**
   * Returns the value of the '<em><b>Recursion Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursion Variable</em>' reference.
   * @see #setRecursionVariable(Recursion)
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getCloseRecursion_RecursionVariable()
   * @model
   * @generated
   */
  Recursion getRecursionVariable();

  /**
   * Sets the value of the '{@link org.xtext.globaltype.globaljade.globalJade.CloseRecursion#getRecursionVariable <em>Recursion Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursion Variable</em>' reference.
   * @see #getRecursionVariable()
   * @generated
   */
  void setRecursionVariable(Recursion value);

} // CloseRecursion