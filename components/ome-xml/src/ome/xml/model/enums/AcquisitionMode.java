/*
 * #%L
 * OME-XML Java library for working with OME-XML metadata structures.
 * %%
 * Copyright (C) 2006 - 2013 Open Microscopy Environment:
 *   - Massachusetts Institute of Technology
 *   - National Institutes of Health
 *   - University of Dundee
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are
 * those of the authors and should not be interpreted as representing official
 * policies, either expressed or implied, of any organization.
 * #L%
 */
/*
 * ome.xml.model.enums.AcquisitionMode
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2007 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by melissa via xsd-fu on 2012-09-10 13:40:23-0400
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.model.enums;

public enum AcquisitionMode implements Enumeration
{
  WIDEFIELD("WideField"), LASERSCANNINGCONFOCALMICROSCOPY("LaserScanningConfocalMicroscopy"), SPINNINGDISKCONFOCAL("SpinningDiskConfocal"), SLITSCANCONFOCAL("SlitScanConfocal"), MULTIPHOTONMICROSCOPY("MultiPhotonMicroscopy"), STRUCTUREDILLUMINATION("StructuredIllumination"), SINGLEMOLECULEIMAGING("SingleMoleculeImaging"), TOTALINTERNALREFLECTION("TotalInternalReflection"), FLUORESCENCELIFETIME("FluorescenceLifetime"), SPECTRALIMAGING("SpectralImaging"), FLUORESCENCECORRELATIONSPECTROSCOPY("FluorescenceCorrelationSpectroscopy"), NEARFIELDSCANNINGOPTICALMICROSCOPY("NearFieldScanningOpticalMicroscopy"), SECONDHARMONICGENERATIONIMAGING("SecondHarmonicGenerationImaging"), PALM("PALM"), STORM("STORM"), STED("STED"), TIRF("TIRF"), FSM("FSM"), LCM("LCM"), OTHER("Other");
  
  private AcquisitionMode(String value)
  {
    this.value = value;
  }

  public static AcquisitionMode fromString(String value)
    throws EnumerationException
  {
    if ("WideField".equals(value))
    {
      return WIDEFIELD;
    }
    if ("LaserScanningConfocalMicroscopy".equals(value))
    {
      return LASERSCANNINGCONFOCALMICROSCOPY;
    }
    if ("SpinningDiskConfocal".equals(value))
    {
      return SPINNINGDISKCONFOCAL;
    }
    if ("SlitScanConfocal".equals(value))
    {
      return SLITSCANCONFOCAL;
    }
    if ("MultiPhotonMicroscopy".equals(value))
    {
      return MULTIPHOTONMICROSCOPY;
    }
    if ("StructuredIllumination".equals(value))
    {
      return STRUCTUREDILLUMINATION;
    }
    if ("SingleMoleculeImaging".equals(value))
    {
      return SINGLEMOLECULEIMAGING;
    }
    if ("TotalInternalReflection".equals(value))
    {
      return TOTALINTERNALREFLECTION;
    }
    if ("FluorescenceLifetime".equals(value))
    {
      return FLUORESCENCELIFETIME;
    }
    if ("SpectralImaging".equals(value))
    {
      return SPECTRALIMAGING;
    }
    if ("FluorescenceCorrelationSpectroscopy".equals(value))
    {
      return FLUORESCENCECORRELATIONSPECTROSCOPY;
    }
    if ("NearFieldScanningOpticalMicroscopy".equals(value))
    {
      return NEARFIELDSCANNINGOPTICALMICROSCOPY;
    }
    if ("SecondHarmonicGenerationImaging".equals(value))
    {
      return SECONDHARMONICGENERATIONIMAGING;
    }
    if ("PALM".equals(value))
    {
      return PALM;
    }
    if ("STORM".equals(value))
    {
      return STORM;
    }
    if ("STED".equals(value))
    {
      return STED;
    }
    if ("TIRF".equals(value))
    {
      return TIRF;
    }
    if ("FSM".equals(value))
    {
      return FSM;
    }
    if ("LCM".equals(value))
    {
      return LCM;
    }
    if ("Other".equals(value))
    {
      return OTHER;
    }
    String s = String.format("%s not a supported value of %s",
                             value, AcquisitionMode.class);
    throw new EnumerationException(s);
  }

  public String getValue()
  {
    return value;
  }

  @Override
  public String toString()
  {
    return value;
  }

  private final String value;
}
