/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.globalJade;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.ForEach#getEachRole <em>Each Role</em>}</li>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.ForEach#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.globaltype.globaljade.globalJade.ForEach#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends EObject
{
  /**
   * Returns the value of the '<em><b>Each Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Each Role</em>' containment reference.
   * @see #setEachRole(Role)
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getForEach_EachRole()
   * @model containment="true"
   * @generated
   */
  Role getEachRole();

  /**
   * Sets the value of the '{@link org.xtext.globaltype.globaljade.globalJade.ForEach#getEachRole <em>Each Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Role</em>' containment reference.
   * @see #getEachRole()
   * @generated
   */
  void setEachRole(Role value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(RoleMultiple)
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getForEach_Role()
   * @model
   * @generated
   */
  RoleMultiple getRole();

  /**
   * Sets the value of the '{@link org.xtext.globaltype.globaljade.globalJade.ForEach#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(RoleMultiple value);

  /**
   * Returns the value of the '<em><b>Branch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branch</em>' containment reference.
   * @see #setBranch(Protocol)
   * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadePackage#getForEach_Branch()
   * @model containment="true"
   * @generated
   */
  Protocol getBranch();

  /**
   * Sets the value of the '{@link org.xtext.globaltype.globaljade.globalJade.ForEach#getBranch <em>Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Branch</em>' containment reference.
   * @see #getBranch()
   * @generated
   */
  void setBranch(Protocol value);

} // ForEach
