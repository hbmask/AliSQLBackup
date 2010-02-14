/* -*- mode: java; c-basic-offset: 4; indent-tabs-mode: nil; -*-
 *  vim:expandtab:shiftwidth=4:tabstop=4:smarttab:
 *
 *  Copyright (C) 2008 MySQL
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package com.mysql.cluster.crund;

import com.mysql.clusterj.annotation.PersistenceCapable;
import com.mysql.clusterj.annotation.PrimaryKey;
import java.io.Serializable;
import java.util.Collection;
import javax.jdo.annotations.NotPersistent;

/**
 * An Entity test interface for use with ClusterJ.
 */
@PersistenceCapable(table="a")
public interface IA {
    @PrimaryKey
    public int getId();
    public void setId(int id);

    public int getCint();
    public void setCint(int cint);

    public long getClong();
    public void setClong(long clong);

    public float getCfloat();
    public void setCfloat(float cfloat);

    public double getCdouble();
    public void setCdouble(double cdouble);
}
