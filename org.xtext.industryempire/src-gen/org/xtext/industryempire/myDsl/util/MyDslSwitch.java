/**
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.industryempire.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.industryempire.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.CLAZZ_MODEL:
      {
        ClazzModel clazzModel = (ClazzModel)theEObject;
        T result = caseClazzModel(clazzModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CITIES:
      {
        Cities cities = (Cities)theEObject;
        T result = caseCities(cities);
        if (result == null) result = caseElement(cities);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VEHICLES:
      {
        Vehicles vehicles = (Vehicles)theEObject;
        T result = caseVehicles(vehicles);
        if (result == null) result = caseElement(vehicles);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SINGLE_VEHICLE:
      {
        SingleVehicle singleVehicle = (SingleVehicle)theEObject;
        T result = caseSingleVehicle(singleVehicle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BUILDINGS:
      {
        Buildings buildings = (Buildings)theEObject;
        T result = caseBuildings(buildings);
        if (result == null) result = caseElement(buildings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SINGLE_BUILDING:
      {
        SingleBuilding singleBuilding = (SingleBuilding)theEObject;
        T result = caseSingleBuilding(singleBuilding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RESOURCES:
      {
        Resources resources = (Resources)theEObject;
        T result = caseResources(resources);
        if (result == null) result = caseElement(resources);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SINGLE_RESOURCE:
      {
        SingleResource singleResource = (SingleResource)theEObject;
        T result = caseSingleResource(singleResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FACTORIES:
      {
        Factories factories = (Factories)theEObject;
        T result = caseFactories(factories);
        if (result == null) result = caseBuildings(factories);
        if (result == null) result = caseElement(factories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clazz Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clazz Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClazzModel(ClazzModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cities</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cities</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCities(Cities object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vehicles</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vehicles</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVehicles(Vehicles object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Vehicle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Vehicle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleVehicle(SingleVehicle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Buildings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Buildings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuildings(Buildings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Building</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Building</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleBuilding(SingleBuilding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResources(Resources object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleResource(SingleResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactories(Factories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
