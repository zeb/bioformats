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
 * ome.xml.model.enums.ExperimentType
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

public enum ExperimentType implements Enumeration
{
  FP("FP"), FRET("FRET"), TIMELAPSE("TimeLapse"), FOURDPLUS("FourDPlus"), SCREEN("Screen"), IMMUNOCYTOCHEMISTRY("Immunocytochemistry"), IMMUNOFLUORESCENCE("Immunofluorescence"), FISH("FISH"), ELECTROPHYSIOLOGY("Electrophysiology"), IONIMAGING("IonImaging"), COLOCALIZATION("Colocalization"), PGIDOCUMENTATION("PGIDocumentation"), FLUORESCENCELIFETIME("FluorescenceLifetime"), SPECTRALIMAGING("SpectralImaging"), PHOTOBLEACHING("Photobleaching"), SPIM("SPIM"), OTHER("Other");
  
  private ExperimentType(String value)
  {
    this.value = value;
  }

  public static ExperimentType fromString(String value)
    throws EnumerationException
  {
    if ("FP".equals(value))
    {
      return FP;
    }
    if ("FRET".equals(value))
    {
      return FRET;
    }
    if ("TimeLapse".equals(value))
    {
      return TIMELAPSE;
    }
    if ("FourDPlus".equals(value))
    {
      return FOURDPLUS;
    }
    if ("Screen".equals(value))
    {
      return SCREEN;
    }
    if ("Immunocytochemistry".equals(value))
    {
      return IMMUNOCYTOCHEMISTRY;
    }
    if ("Immunofluorescence".equals(value))
    {
      return IMMUNOFLUORESCENCE;
    }
    if ("FISH".equals(value))
    {
      return FISH;
    }
    if ("Electrophysiology".equals(value))
    {
      return ELECTROPHYSIOLOGY;
    }
    if ("IonImaging".equals(value))
    {
      return IONIMAGING;
    }
    if ("Colocalization".equals(value))
    {
      return COLOCALIZATION;
    }
    if ("PGIDocumentation".equals(value))
    {
      return PGIDOCUMENTATION;
    }
    if ("FluorescenceLifetime".equals(value))
    {
      return FLUORESCENCELIFETIME;
    }
    if ("SpectralImaging".equals(value))
    {
      return SPECTRALIMAGING;
    }
    if ("Photobleaching".equals(value))
    {
      return PHOTOBLEACHING;
    }
    if ("SPIM".equals(value))
    {
      return SPIM;
    }
    if ("Other".equals(value))
    {
      return OTHER;
    }
    String s = String.format("%s not a supported value of %s",
                             value, ExperimentType.class);
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
