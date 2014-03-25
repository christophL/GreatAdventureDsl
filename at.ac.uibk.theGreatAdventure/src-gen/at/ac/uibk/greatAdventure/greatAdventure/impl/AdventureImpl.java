/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.Adventure;
import at.ac.uibk.greatAdventure.greatAdventure.AdventureTitle;
import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.SceneDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.StartDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adventure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl#getItemDef <em>Item Def</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl#getSceneDef <em>Scene Def</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.AdventureImpl#getStartDef <em>Start Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdventureImpl extends MinimalEObjectImpl.Container implements Adventure
{
  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected AdventureTitle title;

  /**
   * The cached value of the '{@link #getItemDef() <em>Item Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemDef()
   * @generated
   * @ordered
   */
  protected EList<ItemDefinition> itemDef;

  /**
   * The cached value of the '{@link #getSceneDef() <em>Scene Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSceneDef()
   * @generated
   * @ordered
   */
  protected EList<SceneDefinition> sceneDef;

  /**
   * The cached value of the '{@link #getStartDef() <em>Start Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartDef()
   * @generated
   * @ordered
   */
  protected StartDefinition startDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdventureImpl()
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
    return GreatAdventurePackage.Literals.ADVENTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdventureTitle getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(AdventureTitle newTitle, NotificationChain msgs)
  {
    AdventureTitle oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ADVENTURE__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(AdventureTitle newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GreatAdventurePackage.ADVENTURE__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GreatAdventurePackage.ADVENTURE__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ADVENTURE__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemDefinition> getItemDef()
  {
    if (itemDef == null)
    {
      itemDef = new EObjectContainmentEList<ItemDefinition>(ItemDefinition.class, this, GreatAdventurePackage.ADVENTURE__ITEM_DEF);
    }
    return itemDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SceneDefinition> getSceneDef()
  {
    if (sceneDef == null)
    {
      sceneDef = new EObjectContainmentEList<SceneDefinition>(SceneDefinition.class, this, GreatAdventurePackage.ADVENTURE__SCENE_DEF);
    }
    return sceneDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartDefinition getStartDef()
  {
    return startDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartDef(StartDefinition newStartDef, NotificationChain msgs)
  {
    StartDefinition oldStartDef = startDef;
    startDef = newStartDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ADVENTURE__START_DEF, oldStartDef, newStartDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartDef(StartDefinition newStartDef)
  {
    if (newStartDef != startDef)
    {
      NotificationChain msgs = null;
      if (startDef != null)
        msgs = ((InternalEObject)startDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GreatAdventurePackage.ADVENTURE__START_DEF, null, msgs);
      if (newStartDef != null)
        msgs = ((InternalEObject)newStartDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GreatAdventurePackage.ADVENTURE__START_DEF, null, msgs);
      msgs = basicSetStartDef(newStartDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ADVENTURE__START_DEF, newStartDef, newStartDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GreatAdventurePackage.ADVENTURE__TITLE:
        return basicSetTitle(null, msgs);
      case GreatAdventurePackage.ADVENTURE__ITEM_DEF:
        return ((InternalEList<?>)getItemDef()).basicRemove(otherEnd, msgs);
      case GreatAdventurePackage.ADVENTURE__SCENE_DEF:
        return ((InternalEList<?>)getSceneDef()).basicRemove(otherEnd, msgs);
      case GreatAdventurePackage.ADVENTURE__START_DEF:
        return basicSetStartDef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GreatAdventurePackage.ADVENTURE__TITLE:
        return getTitle();
      case GreatAdventurePackage.ADVENTURE__ITEM_DEF:
        return getItemDef();
      case GreatAdventurePackage.ADVENTURE__SCENE_DEF:
        return getSceneDef();
      case GreatAdventurePackage.ADVENTURE__START_DEF:
        return getStartDef();
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
      case GreatAdventurePackage.ADVENTURE__TITLE:
        setTitle((AdventureTitle)newValue);
        return;
      case GreatAdventurePackage.ADVENTURE__ITEM_DEF:
        getItemDef().clear();
        getItemDef().addAll((Collection<? extends ItemDefinition>)newValue);
        return;
      case GreatAdventurePackage.ADVENTURE__SCENE_DEF:
        getSceneDef().clear();
        getSceneDef().addAll((Collection<? extends SceneDefinition>)newValue);
        return;
      case GreatAdventurePackage.ADVENTURE__START_DEF:
        setStartDef((StartDefinition)newValue);
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
      case GreatAdventurePackage.ADVENTURE__TITLE:
        setTitle((AdventureTitle)null);
        return;
      case GreatAdventurePackage.ADVENTURE__ITEM_DEF:
        getItemDef().clear();
        return;
      case GreatAdventurePackage.ADVENTURE__SCENE_DEF:
        getSceneDef().clear();
        return;
      case GreatAdventurePackage.ADVENTURE__START_DEF:
        setStartDef((StartDefinition)null);
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
      case GreatAdventurePackage.ADVENTURE__TITLE:
        return title != null;
      case GreatAdventurePackage.ADVENTURE__ITEM_DEF:
        return itemDef != null && !itemDef.isEmpty();
      case GreatAdventurePackage.ADVENTURE__SCENE_DEF:
        return sceneDef != null && !sceneDef.isEmpty();
      case GreatAdventurePackage.ADVENTURE__START_DEF:
        return startDef != null;
    }
    return super.eIsSet(featureID);
  }

} //AdventureImpl
