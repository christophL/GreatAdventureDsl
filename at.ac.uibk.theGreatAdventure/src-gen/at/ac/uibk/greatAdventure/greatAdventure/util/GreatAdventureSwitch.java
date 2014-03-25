/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.util;

import at.ac.uibk.greatAdventure.greatAdventure.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage
 * @generated
 */
public class GreatAdventureSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GreatAdventurePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreatAdventureSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GreatAdventurePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
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
      case GreatAdventurePackage.ADVENTURE:
      {
        Adventure adventure = (Adventure)theEObject;
        T result = caseAdventure(adventure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreatAdventurePackage.ADVENTURE_TITLE:
      {
        AdventureTitle adventureTitle = (AdventureTitle)theEObject;
        T result = caseAdventureTitle(adventureTitle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreatAdventurePackage.ITEM_DEFINITION:
      {
        ItemDefinition itemDefinition = (ItemDefinition)theEObject;
        T result = caseItemDefinition(itemDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreatAdventurePackage.USE_DEFINITION:
      {
        UseDefinition useDefinition = (UseDefinition)theEObject;
        T result = caseUseDefinition(useDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreatAdventurePackage.SCENE_DEFINITION:
      {
        SceneDefinition sceneDefinition = (SceneDefinition)theEObject;
        T result = caseSceneDefinition(sceneDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreatAdventurePackage.ITEM_POSITION_DEFINITION:
      {
        ItemPositionDefinition itemPositionDefinition = (ItemPositionDefinition)theEObject;
        T result = caseItemPositionDefinition(itemPositionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GreatAdventurePackage.START_DEFINITION:
      {
        StartDefinition startDefinition = (StartDefinition)theEObject;
        T result = caseStartDefinition(startDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adventure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adventure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdventure(Adventure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adventure Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adventure Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdventureTitle(AdventureTitle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemDefinition(ItemDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseDefinition(UseDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scene Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scene Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSceneDefinition(SceneDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Position Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Position Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemPositionDefinition(ItemPositionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartDefinition(StartDefinition object)
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

} //GreatAdventureSwitch
