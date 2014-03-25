/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.StartDefinitionImpl#getStartLoc <em>Start Loc</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.StartDefinitionImpl#getStartItems <em>Start Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartDefinitionImpl extends MinimalEObjectImpl.Container implements StartDefinition
{
  /**
   * The cached value of the '{@link #getStartLoc() <em>Start Loc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartLoc()
   * @generated
   * @ordered
   */
  protected SceneDefinition startLoc;

  /**
   * The cached value of the '{@link #getStartItems() <em>Start Items</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartItems()
   * @generated
   * @ordered
   */
  protected EList<ItemDefinition> startItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartDefinitionImpl()
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
    return GreatAdventurePackage.Literals.START_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneDefinition getStartLoc()
  {
    if (startLoc != null && startLoc.eIsProxy())
    {
      InternalEObject oldStartLoc = (InternalEObject)startLoc;
      startLoc = (SceneDefinition)eResolveProxy(oldStartLoc);
      if (startLoc != oldStartLoc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreatAdventurePackage.START_DEFINITION__START_LOC, oldStartLoc, startLoc));
      }
    }
    return startLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SceneDefinition basicGetStartLoc()
  {
    return startLoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartLoc(SceneDefinition newStartLoc)
  {
    SceneDefinition oldStartLoc = startLoc;
    startLoc = newStartLoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.START_DEFINITION__START_LOC, oldStartLoc, startLoc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemDefinition> getStartItems()
  {
    if (startItems == null)
    {
      startItems = new EObjectResolvingEList<ItemDefinition>(ItemDefinition.class, this, GreatAdventurePackage.START_DEFINITION__START_ITEMS);
    }
    return startItems;
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
      case GreatAdventurePackage.START_DEFINITION__START_LOC:
        if (resolve) return getStartLoc();
        return basicGetStartLoc();
      case GreatAdventurePackage.START_DEFINITION__START_ITEMS:
        return getStartItems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.START_DEFINITION__START_LOC:
        setStartLoc((SceneDefinition)newValue);
        return;
      case GreatAdventurePackage.START_DEFINITION__START_ITEMS:
        getStartItems().clear();
        getStartItems().addAll((Collection<? extends ItemDefinition>)newValue);
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
      case GreatAdventurePackage.START_DEFINITION__START_LOC:
        setStartLoc((SceneDefinition)null);
        return;
      case GreatAdventurePackage.START_DEFINITION__START_ITEMS:
        getStartItems().clear();
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
      case GreatAdventurePackage.START_DEFINITION__START_LOC:
        return startLoc != null;
      case GreatAdventurePackage.START_DEFINITION__START_ITEMS:
        return startItems != null && !startItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StartDefinitionImpl
