/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.globalJade;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.globaltype.globaljade.globalJade.GlobalJadeFactory
 * @model kind="package"
 * @generated
 */
public interface GlobalJadePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "globalJade";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/globaltype/globaljade/GlobalJade";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "globalJade";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GlobalJadePackage eINSTANCE = org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.globaltype.globaljade.globalJade.impl.ModelImpl
   * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROTOCOLS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.ProtocolsImpl <em>Protocols</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.globaltype.globaljade.globalJade.impl.ProtocolsImpl
   * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getProtocols()
   * @generated
   */
  int PROTOCOLS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOLS__NAME = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOLS__ROLES = 1;

  /**
   * The feature id for the '<em><b>Globals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOLS__GLOBALS = 2;

  /**
   * The feature id for the '<em><b>For Loop</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOLS__FOR_LOOP = 3;

  /**
   * The number of structural features of the '<em>Protocols</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOLS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.For_loopImpl <em>For loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.globaltype.globaljade.globalJade.impl.For_loopImpl
   * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getFor_loop()
   * @generated
   */
  int FOR_LOOP = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__NAME = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__ROLE = 1;

  /**
   * The feature id for the '<em><b>Globals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP__GLOBALS = 2;

  /**
   * The number of structural features of the '<em>For loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_LOOP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.Global_messageImpl <em>Global message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.globaltype.globaljade.globalJade.impl.Global_messageImpl
   * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getGlobal_message()
   * @generated
   */
  int GLOBAL_MESSAGE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_MESSAGE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Role A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_MESSAGE__ROLE_A = 1;

  /**
   * The feature id for the '<em><b>Role B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_MESSAGE__ROLE_B = 2;

  /**
   * The number of structural features of the '<em>Global message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_MESSAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.globaltype.globaljade.globalJade.impl.RoleImpl
   * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getRole()
   * @generated
   */
  int ROLE = 4;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ROLE = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.globaltype.globaljade.globalJade.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.globaltype.globaljade.globalJade.Model#getProtocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocols</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Model#getProtocols()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Protocols();

  /**
   * Returns the meta object for class '{@link org.xtext.globaltype.globaljade.globalJade.Protocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocols</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Protocols
   * @generated
   */
  EClass getProtocols();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.Protocols#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Protocols#getName()
   * @see #getProtocols()
   * @generated
   */
  EAttribute getProtocols_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.globaltype.globaljade.globalJade.Protocols#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Protocols#getRoles()
   * @see #getProtocols()
   * @generated
   */
  EReference getProtocols_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.globaltype.globaljade.globalJade.Protocols#getGlobals <em>Globals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Globals</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Protocols#getGlobals()
   * @see #getProtocols()
   * @generated
   */
  EReference getProtocols_Globals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.globaltype.globaljade.globalJade.Protocols#getForLoop <em>For Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>For Loop</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Protocols#getForLoop()
   * @see #getProtocols()
   * @generated
   */
  EReference getProtocols_ForLoop();

  /**
   * Returns the meta object for class '{@link org.xtext.globaltype.globaljade.globalJade.For_loop <em>For loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For loop</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.For_loop
   * @generated
   */
  EClass getFor_loop();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.For_loop#getName()
   * @see #getFor_loop()
   * @generated
   */
  EAttribute getFor_loop_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.For_loop#getRole()
   * @see #getFor_loop()
   * @generated
   */
  EAttribute getFor_loop_Role();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.globaltype.globaljade.globalJade.For_loop#getGlobals <em>Globals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Globals</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.For_loop#getGlobals()
   * @see #getFor_loop()
   * @generated
   */
  EReference getFor_loop_Globals();

  /**
   * Returns the meta object for class '{@link org.xtext.globaltype.globaljade.globalJade.Global_message <em>Global message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global message</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Global_message
   * @generated
   */
  EClass getGlobal_message();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.Global_message#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Global_message#getType()
   * @see #getGlobal_message()
   * @generated
   */
  EAttribute getGlobal_message_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.Global_message#getRoleA <em>Role A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role A</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Global_message#getRoleA()
   * @see #getGlobal_message()
   * @generated
   */
  EAttribute getGlobal_message_RoleA();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.Global_message#getRoleB <em>Role B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role B</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Global_message#getRoleB()
   * @see #getGlobal_message()
   * @generated
   */
  EAttribute getGlobal_message_RoleB();

  /**
   * Returns the meta object for class '{@link org.xtext.globaltype.globaljade.globalJade.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.globaltype.globaljade.globalJade.Role#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.xtext.globaltype.globaljade.globalJade.Role#getRole()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Role();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GlobalJadeFactory getGlobalJadeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.globaltype.globaljade.globalJade.impl.ModelImpl
     * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROTOCOLS = eINSTANCE.getModel_Protocols();

    /**
     * The meta object literal for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.ProtocolsImpl <em>Protocols</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.globaltype.globaljade.globalJade.impl.ProtocolsImpl
     * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getProtocols()
     * @generated
     */
    EClass PROTOCOLS = eINSTANCE.getProtocols();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOLS__NAME = eINSTANCE.getProtocols_Name();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOLS__ROLES = eINSTANCE.getProtocols_Roles();

    /**
     * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOLS__GLOBALS = eINSTANCE.getProtocols_Globals();

    /**
     * The meta object literal for the '<em><b>For Loop</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOLS__FOR_LOOP = eINSTANCE.getProtocols_ForLoop();

    /**
     * The meta object literal for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.For_loopImpl <em>For loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.globaltype.globaljade.globalJade.impl.For_loopImpl
     * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getFor_loop()
     * @generated
     */
    EClass FOR_LOOP = eINSTANCE.getFor_loop();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_LOOP__NAME = eINSTANCE.getFor_loop_Name();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_LOOP__ROLE = eINSTANCE.getFor_loop_Role();

    /**
     * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_LOOP__GLOBALS = eINSTANCE.getFor_loop_Globals();

    /**
     * The meta object literal for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.Global_messageImpl <em>Global message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.globaltype.globaljade.globalJade.impl.Global_messageImpl
     * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getGlobal_message()
     * @generated
     */
    EClass GLOBAL_MESSAGE = eINSTANCE.getGlobal_message();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_MESSAGE__TYPE = eINSTANCE.getGlobal_message_Type();

    /**
     * The meta object literal for the '<em><b>Role A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_MESSAGE__ROLE_A = eINSTANCE.getGlobal_message_RoleA();

    /**
     * The meta object literal for the '<em><b>Role B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_MESSAGE__ROLE_B = eINSTANCE.getGlobal_message_RoleB();

    /**
     * The meta object literal for the '{@link org.xtext.globaltype.globaljade.globalJade.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.globaltype.globaljade.globalJade.impl.RoleImpl
     * @see org.xtext.globaltype.globaljade.globalJade.impl.GlobalJadePackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__ROLE = eINSTANCE.getRole_Role();

  }

} //GlobalJadePackage