/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.globalJade;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getGlobals <em>Globals</em>}</li>
 * </ul>
 *
 * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getFor_loop()
 * @model
 * @generated
 */
public interface For_loop extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getFor_loop_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getFor_loop_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

  /**
   * Returns the value of the '<em><b>Globals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.globaltype.globaljade.globalJade.Global_message}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globals</em>' containment reference list.
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getFor_loop_Globals()
   * @model containment="true"
   * @generated
   */
  EList<Global_message> getGlobals();

} // For_loop
