/**
 * generated by Xtext 2.34.0
 */
package org.xtext.globaltype.globaljade.globalJade.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.globaltype.globaljade.globalJade.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalJadeFactoryImpl extends EFactoryImpl implements GlobalJadeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GlobalJadeFactory init()
  {
    try
    {
      GlobalJadeFactory theGlobalJadeFactory = (GlobalJadeFactory)EPackage.Registry.INSTANCE.getEFactory(GlobalJadePackage.eNS_URI);
      if (theGlobalJadeFactory != null)
      {
        return theGlobalJadeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GlobalJadeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalJadeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GlobalJadePackage.MODEL: return createModel();
      case GlobalJadePackage.ROLES: return createRoles();
      case GlobalJadePackage.ROLE: return createRole();
      case GlobalJadePackage.ONE_ROLE: return createOneRole();
      case GlobalJadePackage.MULTIPLE_ROLE: return createMultipleRole();
      case GlobalJadePackage.PROTOCOL: return createProtocol();
      case GlobalJadePackage.RECURSION: return createRecursion();
      case GlobalJadePackage.END_RECURSION: return createEnd_Recursion();
      case GlobalJadePackage.CONTINUE_RECURSION: return createContinue_Recursion();
      case GlobalJadePackage.CHOICE_RULE: return createChoice_rule();
      case GlobalJadePackage.FOR_LOOP: return createFor_loop();
      case GlobalJadePackage.END_MESSAGE: return createEnd_message();
      case GlobalJadePackage.MESSAGE: return createMessage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Roles createRoles()
  {
    RolesImpl roles = new RolesImpl();
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OneRole createOneRole()
  {
    OneRoleImpl oneRole = new OneRoleImpl();
    return oneRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultipleRole createMultipleRole()
  {
    MultipleRoleImpl multipleRole = new MultipleRoleImpl();
    return multipleRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Recursion createRecursion()
  {
    RecursionImpl recursion = new RecursionImpl();
    return recursion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public End_Recursion createEnd_Recursion()
  {
    End_RecursionImpl end_Recursion = new End_RecursionImpl();
    return end_Recursion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Continue_Recursion createContinue_Recursion()
  {
    Continue_RecursionImpl continue_Recursion = new Continue_RecursionImpl();
    return continue_Recursion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Choice_rule createChoice_rule()
  {
    Choice_ruleImpl choice_rule = new Choice_ruleImpl();
    return choice_rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public For_loop createFor_loop()
  {
    For_loopImpl for_loop = new For_loopImpl();
    return for_loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public End_message createEnd_message()
  {
    End_messageImpl end_message = new End_messageImpl();
    return end_message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalJadePackage getGlobalJadePackage()
  {
    return (GlobalJadePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GlobalJadePackage getPackage()
  {
    return GlobalJadePackage.eINSTANCE;
  }

} //GlobalJadeFactoryImpl
