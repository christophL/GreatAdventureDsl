/**
 */
package at.ac.uibk.greatAdventure.greatAdventure.impl;

import at.ac.uibk.greatAdventure.greatAdventure.GreatAdventurePackage;
import at.ac.uibk.greatAdventure.greatAdventure.ItemDefinition;
import at.ac.uibk.greatAdventure.greatAdventure.UseDefinition;

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
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl#isPickup <em>Pickup</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl#getImg <em>Img</em>}</li>
 *   <li>{@link at.ac.uibk.greatAdventure.greatAdventure.impl.ItemDefinitionImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemDefinitionImpl extends MinimalEObjectImpl.Container implements ItemDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isPickup() <em>Pickup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPickup()
   * @generated
   * @ordered
   */
  protected static final boolean PICKUP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPickup() <em>Pickup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPickup()
   * @generated
   * @ordered
   */
  protected boolean pickup = PICKUP_EDEFAULT;

  /**
   * The default value of the '{@link #getImg() <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImg()
   * @generated
   * @ordered
   */
  protected static final String IMG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImg() <em>Img</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImg()
   * @generated
   * @ordered
   */
  protected String img = IMG_EDEFAULT;

  /**
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected EList<UseDefinition> uses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemDefinitionImpl()
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
    return GreatAdventurePackage.Literals.ITEM_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ITEM_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPickup()
  {
    return pickup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPickup(boolean newPickup)
  {
    boolean oldPickup = pickup;
    pickup = newPickup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ITEM_DEFINITION__PICKUP, oldPickup, pickup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImg()
  {
    return img;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImg(String newImg)
  {
    String oldImg = img;
    img = newImg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreatAdventurePackage.ITEM_DEFINITION__IMG, oldImg, img));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseDefinition> getUses()
  {
    if (uses == null)
    {
      uses = new EObjectContainmentEList<UseDefinition>(UseDefinition.class, this, GreatAdventurePackage.ITEM_DEFINITION__USES);
    }
    return uses;
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
      case GreatAdventurePackage.ITEM_DEFINITION__USES:
        return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
      case GreatAdventurePackage.ITEM_DEFINITION__NAME:
        return getName();
      case GreatAdventurePackage.ITEM_DEFINITION__PICKUP:
        return isPickup();
      case GreatAdventurePackage.ITEM_DEFINITION__IMG:
        return getImg();
      case GreatAdventurePackage.ITEM_DEFINITION__USES:
        return getUses();
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
      case GreatAdventurePackage.ITEM_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case GreatAdventurePackage.ITEM_DEFINITION__PICKUP:
        setPickup((Boolean)newValue);
        return;
      case GreatAdventurePackage.ITEM_DEFINITION__IMG:
        setImg((String)newValue);
        return;
      case GreatAdventurePackage.ITEM_DEFINITION__USES:
        getUses().clear();
        getUses().addAll((Collection<? extends UseDefinition>)newValue);
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
      case GreatAdventurePackage.ITEM_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GreatAdventurePackage.ITEM_DEFINITION__PICKUP:
        setPickup(PICKUP_EDEFAULT);
        return;
      case GreatAdventurePackage.ITEM_DEFINITION__IMG:
        setImg(IMG_EDEFAULT);
        return;
      case GreatAdventurePackage.ITEM_DEFINITION__USES:
        getUses().clear();
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
      case GreatAdventurePackage.ITEM_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GreatAdventurePackage.ITEM_DEFINITION__PICKUP:
        return pickup != PICKUP_EDEFAULT;
      case GreatAdventurePackage.ITEM_DEFINITION__IMG:
        return IMG_EDEFAULT == null ? img != null : !IMG_EDEFAULT.equals(img);
      case GreatAdventurePackage.ITEM_DEFINITION__USES:
        return uses != null && !uses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", pickup: ");
    result.append(pickup);
    result.append(", img: ");
    result.append(img);
    result.append(')');
    return result.toString();
  }

} //ItemDefinitionImpl
